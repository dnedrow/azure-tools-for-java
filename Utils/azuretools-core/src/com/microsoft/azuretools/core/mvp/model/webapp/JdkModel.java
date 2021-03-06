package com.microsoft.azuretools.core.mvp.model.webapp;

import com.microsoft.azure.management.appservice.JavaVersion;

public enum JdkModel {
    JAVA_11_0_2("11.0.2", JavaVersion.JAVA_11),
    JAVA_8_NEWEST("Newest Java 8", JavaVersion.JAVA_8_NEWEST),
    JAVA_1_8_0_25("1.8.0_25", JavaVersion.JAVA_1_8_0_25),
    JAVA_1_8_0_60("1.8.0_60", JavaVersion.JAVA_1_8_0_60),
    JAVA_1_8_0_73("1.8.0_73", JavaVersion.JAVA_1_8_0_73),
    JAVA_1_8_0_111("1.8.0_111", JavaVersion.JAVA_1_8_0_111),
    JAVA_1_8_0_202("1.8.0_202", JavaVersion.JAVA_1_8_0_202),
    JAVA_7_NEWEST("Newest Java 7", JavaVersion.JAVA_7_NEWEST),
    JAVA_1_7_0_51("1.7.0_51", JavaVersion.JAVA_1_7_0_51),
    JAVA_1_7_0_71("1.7.0_71", JavaVersion.JAVA_1_7_0_71),
    JAVA_ZULU_11_0_2("Zulu 11.0.2", JavaVersion.JAVA_ZULU_11_0_2),
    JAVA_ZULU_1_8_0_92("Zulu 1.8.0_92", JavaVersion.JAVA_ZULU_1_8_0_92),
    JAVA_ZULU_1_8_0_102("Zulu 1.8.0_102", JavaVersion.JAVA_ZULU_1_8_0_102),
    JAVA_ZULU_1_8_0_202("Zulu 1.8.0_202", JavaVersion.JAVA_ZULU_1_8_0_202);

    private final String displayName;
    private final JavaVersion javaVersion;

    JdkModel(String displayName, JavaVersion javaVersion) {
        this.displayName = displayName;
        this.javaVersion = javaVersion;
    }

    public JavaVersion getJavaVersion() {
        return javaVersion;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
