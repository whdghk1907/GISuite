package com.gisuite.util;

import javax.measure.Quantity;
import javax.measure.Unit;
import javax.measure.quantity.Length;
import tech.units.indriya.quantity.Quantities;
import tech.units.indriya.unit.Units;

/**
 * ISO 19103에서 정의된 파생 타입을 Java JSR-363 기반으로 매핑.
 */
public class DerivedTypes {
    public static Quantity<Length> asLength(double value, Unit<Length> unit) {
        return Quantities.getQuantity(value, unit);
    }

    public static Unit<Length> meter() {
        return Units.METRE;
    }

    public static Unit<Length> kilometre() {
        return Units.METRE.multiply(1000); // 킬로미터 단위 정의
    }
}
