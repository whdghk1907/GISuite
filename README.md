# GISuite

GISuite는 GIS 초보자를 위해 **OGC 표준을 준수하는 Spring Boot 기반 JPA 프레임워크**를 제공하는 프로젝트입니다.
GIS 데이터를 보다 쉽게 다룰 수 있도록, PostGIS 및 Hibernate Spatial을 활용한 표준화된 데이터베이스 구조를 제공합니다.

## 🚀 프로젝트 개요
- **프레임워크 목적**: OGC 표준을 준수하는 GIS 데이터베이스를 쉽고 직관적으로 사용할 수 있도록 지원
- **주요 기술 스택**:
  - **Spring Boot 3.x** (최신 안정 버전)
  - **Hibernate Spatial** (OGC 표준 공간 데이터 처리)
  - **PostGIS** (PostgreSQL 기반 공간 데이터베이스)
  - **GeoTools** (GIS 데이터 변환 및 좌표 변환 지원)
  - **Maven** (의존성 관리 및 빌드 시스템)

## 📌 주요 기능
- OGC 표준을 준수하는 데이터베이스 구조 제공
- JPA와 PostGIS 연동을 위한 **Hibernate Spatial 지원**
- GeoTools 기반의 좌표 변환 및 공간 분석 기능 제공
- GIS 데이터 처리 및 관리 기능 제공 (Shapefile, GeoJSON 등 지원)
- Spring Boot 기반 REST API를 활용한 GIS 데이터 조회 및 관리

## 📂 프로젝트 구조
```
GISuite/
├── src/
│   ├── main/
│   │   ├── java/com/gisuite/
│   │   │   ├── config/        # 프로젝트 설정 및 환경 구성
│   │   │   ├── entity/        # GIS 관련 JPA 엔티티
│   │   │   ├── repository/    # GIS 관련 JPA Repository
│   │   │   ├── service/       # GIS 관련 비즈니스 로직
│   ├── resources/
│   │   ├── application.yml    # Spring Boot 환경설정
│   │   ├── data/              # GIS 데이터 샘플
│   └── test/                  # 테스트 코드
├── pom.xml                     # Maven 설정 파일
└── README.md                   # 프로젝트 설명
```

## 📂 패키지별 상세 설명
### 1️⃣ `config` 패키지 (프로젝트 설정)
- `DatabaseConfig.java`: 데이터베이스 및 JPA 설정
- `SwaggerConfig.java`: Swagger(OpenAPI) 설정
- `WebConfig.java`: 웹 관련 설정 (정적 리소스, CORS 등)

### 2️⃣ `entity` 패키지 (GIS 관련 JPA 엔티티)
- `GisEntity.java`: 기본 GIS 데이터 엔티티 (공간 데이터 저장)

### 3️⃣ `repository` 패키지 (GIS 관련 데이터 접근 계층)
- `GisRepository.java`: GIS 데이터 저장소

### 4️⃣ `service` 패키지 (GIS 관련 비즈니스 로직)
- `GisService.java`: GIS 데이터 처리 서비스

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

## 🔗 참고 문서
- [Spring Boot 공식 문서](https://spring.io/projects/spring-boot)
- [Hibernate Spatial](https://www.postgresql.org/docs/current/postgis.html)
- [GeoTools 공식 문서](https://docs.geotools.org/)

## 📜 라이선스
이 프로젝트는 **Apache 2.0 License**를 따릅니다. 자유롭게 사용 및 수정 가능합니다.
