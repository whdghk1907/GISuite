package com.gisuite.util;

import javax.measure.Quantity;
import javax.measure.Unit;
import javax.measure.quantity.Area;
import javax.measure.quantity.Length;
import javax.measure.quantity.Angle;
import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Time;
import javax.measure.quantity.Volume;
import javax.measure.quantity.Speed;
import java.util.Collections;

import tech.units.indriya.quantity.Quantities;
import tech.units.indriya.unit.Units;
import tech.units.indriya.AbstractUnit;
/**
 * ISO 19103에서 정의된 파생 타입(Derived Types)을 GeoAPI Implementation Specification 표준에 맞게 구현.
 */
public class DerivedTypes {
    // Measure 관련 메서드
    public static <Q extends Quantity<Q>> Quantity<Q> asMeasure(double value, Unit<Q> unit) {
        return Quantities.getQuantity(value, unit);
    }

    // UnitOfMeasure 메서드 예시 (길이 단위)
    public static Unit<Length> meter() {
        return Units.METRE;
    }

    public static Unit<Length> kilometre() {
        return Units.METRE.multiply(1000);
    }

    // Area 단위
    public static Unit<Area> squareMeter() {
        return Units.SQUARE_METRE;
    }

    // Dimensionless 단위
    public static Unit<Dimensionless> dimensionless() {
        return AbstractUnit.ONE;
    }

    // Angle 단위
    public static Unit<Angle> degree() {
        return Units.RADIAN;
    }

    // Time 단위
    public static Unit<Time> second() {
        return Units.SECOND;
    }

    // Volume 단위
    public static Unit<Volume> cubicMeter() {
        return Units.CUBIC_METRE;
    }

    // Velocity 단위
    public static Unit<Speed> meterPerSecond() {
        return Units.METRE_PER_SECOND;
    }

    // NULL 및 EMPTY 관련 메서드
    public static Object asNull() {
        return null;
    }

    public static <T> java.util.Set<T> asEmptySet() {
        return Collections.emptySet();
    }
}
