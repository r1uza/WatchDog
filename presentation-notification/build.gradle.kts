plugins { `java-library` }
java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }

dependencies {
    implementation(project(":notification"))
}
