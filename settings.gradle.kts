pluginManagement {
  listOf(repositories, dependencyResolutionManagement.repositories).forEach {
    it.apply {
      mavenCentral()
      google()
    }
  }
}

include(":graphql")
include(":mod:realtime")
include(":mod:realtime:impl")