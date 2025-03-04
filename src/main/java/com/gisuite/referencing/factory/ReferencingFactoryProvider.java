package com.gisuite.referencing.factory;

import com.gisuite.referencing.crs.CRSFactory;
import com.gisuite.referencing.cs.CSFactory;
import com.gisuite.referencing.datum.DatumFactory;
import com.gisuite.referencing.operation.CoordinateOperationFactory;
import com.gisuite.referencing.operation.MathTransformFactory;
/**
 * ReferencingFactoryProvider 클래스: GISuite에서 사용되는 모든 팩토리 객체를 중앙에서 제공
 */
public class ReferencingFactoryProvider {

    private static final CRSFactory crsFactory = new CRSFactory();
    private static final CSFactory csFactory = new CSFactory();
    private static final DatumFactory datumFactory = new DatumFactory();
    private static final CoordinateOperationFactory coordinateOperationFactory = new CoordinateOperationFactory();
    private static final MathTransformFactory mathTransformFactory = new MathTransformFactory();

    public static CRSFactory getCRSFactory() {
        return crsFactory;
    }

    public static CSFactory getCSFactory() {
        return csFactory;
    }

    public static DatumFactory getDatumFactory() {
        return datumFactory;
    }

    public static CoordinateOperationFactory getCoordinateOperationFactory() {
        return coordinateOperationFactory;
    }

    public static MathTransformFactory getMathTransformFactory() {
        return mathTransformFactory;
    }
}

