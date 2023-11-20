import org.gradle.internal.impldep.org.glassfish.jaxb.runtime.v2.schemagen.xmlschema.Import

plugins {
	java
	id("org.springframework.boot") version "2.7.17"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	id("com.diffplug.spotless") version "6.18.0"
}

group = "studio.aroundhub"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

spotless{
	format("yaml") {
		target("**/*.yaml", "**/*.yml")
		prettier().configFile(".prettierrc") //파일 따로 추가
	}
	java{
		removeUnusedImports() // 사용하지 않는 import 제거
		googleJavaFormat() // 구글 자바 포맷 적용
		importOrder(
				"java",
				"jakarta",
				"lombok",
				"org.springframework",
				"",
				"\\#",
				"studio.aroundhub",
				"\\#studio.aroundhub"
		)
		indentWithTabs(2)
		indentWithSpaces(2)
		trimTrailingWhitespace() // 공백 제거
		endWithNewline() // 끝부분 New Line 처리
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	compileOnly("org.projectlombok:lombok")
	runtimeOnly("org.mariadb.jdbc:mariadb-java-client")
	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

