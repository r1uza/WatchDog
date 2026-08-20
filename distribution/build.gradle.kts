plugins { `java-library` }
java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }

dependencies {
    implementation(project(":release"))
    implementation(project(":security"))
    implementation(project(":verification-e2e"))
    implementation(project(":accessibility"))
}
