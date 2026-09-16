#version 120

uniform sampler2D DiffuseSampler;

varying vec2 texCoord;
varying vec2 oneTexel;

uniform vec2 InSize;

uniform vec2 BlurDir;
uniform float Radius;

void main() {
    vec4 blur = vec4(0.0);
    float totalStrength = 0.0;
    float totalAlpha = 0.0;
    float totalSamples = 0.0;
    float floorRadius = floor(Radius);

    for (float r = -floorRadius; r <= floorRadius; r += 1.0) {
        vec4 textureSample = texture2D(DiffuseSampler, texCoord + oneTexel * r * BlurDir);

        totalAlpha = totalAlpha + textureSample.a;
        totalSamples = totalSamples + 1.0;

        float strength = 1.0 - abs(r / floorRadius);
        totalStrength = totalStrength + strength;
        blur = blur + textureSample;
    }
    gl_FragColor = vec4(blur.rgb / (floorRadius * 2.0 + 1.0), totalAlpha);
}