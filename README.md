# 🌍 GISuite

**GISuite**는 GIS 초보자를 위해 **OGC 표준을 준수하는 Spring Boot 기반 JPA 프레임워크**를 제공합니다.  
GIS 데이터를 보다 쉽게 다룰 수 있도록, **PostGIS 및 Hibernate Spatial**을 활용한 표준화된 데이터베이스 구조와  
OGC 표준 좌표 참조 시스템 및 공간 데이터 처리 기능을 제공합니다.

---

## 🚀 프로젝트 개요

### 🔹 **프레임워크 목적**
- OGC 표준을 준수하는 GIS 데이터베이스를 **쉽고 직관적으로 사용**할 수 있도록 지원

### 🔹 **주요 기술 스택**
- **Spring Boot 3.x** (최신 안정 버전)
- **Hibernate Spatial** (OGC 표준 공간 데이터 처리)
- **PostGIS** (PostgreSQL 기반 공간 데이터베이스)
- **GeoTools** (GIS 데이터 변환 및 좌표 변환 지원)
- **Maven** (의존성 관리 및 빌드 시스템)

---

## 📌 주요 기능
✅ **OGC 표준을 준수하는 공간 데이터베이스 및 좌표 참조 시스템 지원**  
✅ **JPA와 PostGIS 연동을 위한 Hibernate Spatial 지원**  
✅ **GeoTools 기반 좌표 변환 및 공간 분석 기능 제공**  
✅ **OGC 표준에 따른 지오메트리 모델 및 메타데이터 구조 제공**  
✅ **Spring Boot 기반 REST API를 활용한 GIS 데이터 조회 및 관리**  
✅ **Shapefile, GeoJSON 등 다양한 GIS 데이터 형식 지원**

---

## 📂 프로젝트 구조
```plaintext
GISuite/
├── src/
│   ├── main/
│   │   ├── java/com/gisuite/
│   │   │   ├── annotation/      # OGC UML 표준 어노테이션 정의
│   │   │   ├── config/          # 프로젝트 설정 및 환경 구성
│   │   │   ├── entity/          # GIS 관련 JPA 엔티티 (CRS, 공간 데이터 등)
│   │   │   ├── metadata/        # OGC 표준 메타데이터 관리 (ISO 19115)
│   │   │   ├── geometry/        # OGC 표준 공간 데이터 모델 (ISO 19107)
│   │   │   ├── referencing/     # 좌표 참조 시스템 (ISO 19111)
│   │   │   ├── parameter/       # 좌표 변환 및 수학적 변환 연산 (ISO 19111)
│   │   │   ├── repository/      # GIS 관련 JPA Repository
│   │   │   ├── service/         # GIS 관련 비즈니스 로직
│   ├── resources/
│   │   ├── application.yml      # Spring Boot 환경설정
│   │   ├── data/                # GIS 데이터 샘플
│   └── test/                    # 테스트 코드
├── pom.xml                       # Maven 설정 파일
└── README.md                     # 프로젝트 설명
```

---

## 📂 패키지별 상세 설명

### 1️⃣ `annotation` 패키지 (OGC UML 표준 어노테이션)
- `UML.java` : OGC UML 모델을 Java 코드에 적용하는 어노테이션
- `Obligation.java` : OGC 표준에서 속성의 필수 여부(MANDATORY, OPTIONAL 등)를 정의하는 열거형

### 2️⃣ `entity` 패키지 (GIS 관련 JPA 엔티티)
- `CRS.java` : OGC 표준 좌표 참조 시스템(CRS) 엔티티
- `SpatialEntity.java` : 공간 데이터를 저장하는 엔티티 (ISO 19107 준수)

### 3️⃣ `metadata` 패키지 (ISO 19115 기반 메타데이터 관리)
- `Metadata.java` : OGC 표준 메타데이터 저장 엔티티
- `Citation.java` : 데이터 출처 및 인용 정보 관리
- `ResponsibleParty.java` : 메타데이터 책임 기관 정보 관리

### 4️⃣ `geometry` 패키지 (ISO 19107 기반 공간 데이터 모델)
- `Position.java` : 공간 위치를 표현하는 인터페이스
- `DirectPosition.java` : 좌표 값을 나타내는 클래스
- `Envelope.java` : 공간 데이터의 경계를 나타내는 경계 박스

### 5️⃣ `referencing` 패키지 (ISO 19111 기반 좌표 참조 시스템)
- `CoordinateReferenceSystem.java` : 좌표 참조 시스템(CRS) 정의
- `CoordinateSystem.java` : 좌표 축 및 차원 정의
- `Datum.java` : 기준 데이터(Datum) 저장
- `Ellipsoid.java` : 타원체 정보 저장
- `PrimeMeridian.java` : 본초 자오선 정보 저장

### 6️⃣ `parameter` 패키지 (ISO 19111 기반 좌표 변환 및 수학적 변환)
- `ParameterValue.java` : 좌표 변환 파라미터 값 저장
- `ParameterValueGroup.java` : 변환 파라미터 그룹 관리
- `CoordinateOperation.java` : 좌표 변환 연산 정의
- `MathTransform.java` : 좌표 변환 수학적 연산
- `TransformFactory.java` : 변환 연산을 등록하고 관리하는 팩토리

### 7️⃣ `repository` 패키지 (GIS 관련 데이터 접근 계층)
- `CRRepository.java` : CRS 데이터 저장소
- `SpatialEntityRepository.java` : 공간 데이터 저장소

### 8️⃣ `service` 패키지 (GIS 관련 비즈니스 로직)
- `CRSService.java` : 좌표 참조 시스템 관리 서비스
- `SpatialEntityService.java` : 공간 데이터 관리 서비스

---

## 🛠️ 설치 및 실행 방법

### 1. **필수 사전 준비**
- **Java 17 이상** 설치
- **PostgreSQL + PostGIS** 설치
- **Maven 3.9+** 설치

### 2. **프로젝트 클론 및 실행**
```sh
git clone https://github.com/your-username/GISuite.git
cd GISuite
mvn clean install
mvn spring-boot:run
```

### 3. **PostGIS 데이터베이스 설정**
1. PostgreSQL에 PostGIS 확장 설치:
```sql
CREATE DATABASE gisuite;
\c gisuite
CREATE EXTENSION postgis;
```
2. `application.yml`에서 DB 설정 수정 후 적용

### 4. **API 테스트 (Swagger UI 제공)**
- 실행 후 브라우저에서 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) 접속

---

## 🔗 참고 문서
- [Spring Boot 공식 문서](https://spring.io/projects/spring-boot)
- [Hibernate Spatial](https://www.postgresql.org/docs/current/postgis.html)
- [GeoTools 공식 문서](https://docs.geotools.org/)
- [OGC 표준 문서](https://www.ogc.org/standards)

---

## 📜 라이선스
이 프로젝트는 **Apache 2.0 License**를 따릅니다. 자유롭게 사용 및 수정 가능합니다.
