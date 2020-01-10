with(rootProject) {
    name = "yet-another-counter-but-fully-in-kotlin"
    buildFileName = "build.gradle.kts"
}

include("backend")
include("backend:core")

include("frontend")
include("frontend:public-viewer")