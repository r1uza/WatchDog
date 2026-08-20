plugins { `java-library` }
java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }

dependencies {
    implementation(project(":observation"))
    implementation(project(":snapshot"))
    implementation(project(":health"))
    implementation(project(":watch"))
    implementation(project(":alert"))
    implementation(project(":journal"))
    implementation(project(":persistence"))
}
