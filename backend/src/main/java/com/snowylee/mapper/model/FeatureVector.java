package com.snowylee.mapper.model;

public class FeatureVector {
    public double nameSim;
    public double descSim;
    public double typeSim;
    public double tableSim;
    public double cooccur;

    public double toScore(double[] w) {
        return w[0] * nameSim + w[1] * descSim + w[2] * typeSim + w[3] * tableSim + w[4] * cooccur;
    }
}