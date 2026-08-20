plugins { `java-library` }
java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }

dependencies {
    implementation(project(":application"))
    implementation(project(":settings"))
    implementation(project(":notification"))
    implementation(project(":diagnostics"))
    implementation(project(":security"))
    implementation(project(":observability"))
    implementation(project(":resource-governance"))
    implementation(project(":resilience"))
    implementation(project(":integrity"))
    implementation(project(":migration"))
    implementation(project(":backup"))
    implementation(project(":accessibility"))
    implementation(project(":lifecycle"))
}
