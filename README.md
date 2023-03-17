# SpringCore
## Maven
</n>
Apache Maven is a build automation and project management tool used primarily for Java projects. It helps to manage dependencies, build and test your projects, and package and deploy them to various environments. Maven uses a declarative approach to define the build process, using an XML file called pom.xml (Project Object Model). It provides a standardized way to organize your project structure, and integrates with various IDEs and build tools to make development and deployment easier. Some key features of Maven include dependency management, build profiles, plugins, and a central repository for storing and sharing artifacts.
</n>

## Dependencies in Maven -:

</n>
In Maven, dependencies are external libraries or modules that are required to build and run a project.

Maven provides a central repository where developers can search for and download dependencies, rather than having to manually download and add them to the project.

To add a dependency to a Maven project, you need to specify the dependency's artifact coordinates, which typically include its group ID, artifact ID, and version number.

When you build the project using Maven, it automatically downloads and includes the necessary dependencies from the central repository or any other specified repositories. This helps to manage the project's dependencies efficiently and ensures that the project is using the correct and compatible versions of external libraries.
</n>

## Types Of Repositery In Maven -:

</n>
In Maven, there are three types of repositories:

**Local repository:** 
It is a local cache of downloaded dependencies and plugins for a specific user. When a user executes a build for the first time, Maven downloads all the dependencies and plugins required to execute the build and stores them in the local repository. By default, the local repository is located in the user's home directory and can be configured in the settings.xml file.

**Central repository:** It is the default repository for Maven and contains a large number of widely-used dependencies and plugins. When a dependency or plugin is not found in the local repository, Maven searches for it in the central repository.

**Remote repository:** It is a repository other than the central repository that can be added to the project's pom.xml file. It can be a public repository, such as Maven Central, or a private repository, such as a corporate repository. Remote repositories allow teams to share dependencies and plugins across projects and can be used to distribute proprietary artifacts.
</n>
