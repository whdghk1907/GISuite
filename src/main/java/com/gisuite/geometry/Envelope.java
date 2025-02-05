package com.gisuite.geometry;

/**
 * ISO 19107 기반의 Envelope (경계 박스).
 * 각 축(axis)의 최소/최대 값을 저장하는 클래스.
 */
public class Envelope {
    private final DirectPosition lowerCorner;
    private final DirectPosition upperCorner;

    public Envelope(DirectPosition lowerCorner, DirectPosition upperCorner) {
        if (lowerCorner.getCoordinates().length != upperCorner.getCoordinates().length) {
            throw new MismatchedDimensionException("좌표 차원이 일치하지 않습니다.");
        }
        this.lowerCorner = lowerCorner;
        this.upperCorner = upperCorner;
    }

    public DirectPosition getLowerCorner() {
        return lowerCorner;
    }

    public DirectPosition getUpperCorner() {
        return upperCorner;
    }

    @Override
    public String toString() {
        return "Envelope [lower=" + lowerCorner + ", upper=" + upperCorner + "]";
    }
}
