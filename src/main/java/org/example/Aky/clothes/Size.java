package org.example.Aky.clothes;
enum Size {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);
    private int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }
}
