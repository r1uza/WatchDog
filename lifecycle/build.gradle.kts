plugins { `java-library` }
java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }

dependencies {
    implementation(project(":core"))
    implementation(project(":security"))
    implementation(project(":resource-governance"))
    implementation(project(":resilience"))
    implementation(project(":integrity"))
    implementation(project(":migration"))
}
