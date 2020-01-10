subprojects {
    group = "io.gettis"
    version = "1.0.0-SNAPSHOT"

    repositories {
        jcenter()
    }
}

tasks {
    wrapper {
        version = "6.0.1"
        distributionType = Wrapper.DistributionType.ALL
    }
}