# Example ANTLR

I wanted to have a bare minimum ANTLR project handy written in Java and specifically for Eclipse. So, I created this repo for that purpose and it may be useful for anyone else. 

# Instructions

Most of the setup work is described discussed [here](https://tomassetti.me/antlr-mega-tutorial/) and some code is provided [here](https://github.com/unosviluppatore/antlr-mega-tutorial). The pom file will take care of the antlr4 dependencies as well as the antrl4 maven plugin which is crucial for properly generating the lexer/parser/visitor/listener classes treated as source code so it can be used by your main code. 

The project structure is almost identical to the markup-example project found in the link but this is how it actually looks like once the project is built using the pom file:

<img src=http://oi66.tinypic.com/2vk1075.jpg alt="drawing" width="200"/>

With this setup, the maven plugin for antlr4 looks for the `.g4` grammar file residing in a folder under ```src/main/antlr4/...```. Make sure this nested folder structure are regular ones, i.e. not treated as Java source code by Eclipse. Once you have this structure when you generate the antlr4 files based on the `.g4` file, the generated files will reside in a ```target/generated-sources/antlr4``` folder by default. If this turns out to be non-source, right click folder, select ```Build Path > Use as Source Folder```. This is important because you want to be able to import the generated Java files with your main code which resides in the ```src/main/java/...``` folder.

In the above picture, I have left out other folders that are generated inside of the other non-source ```target``` folder to focus on the essential files you need.

# Resources

To get a better understanding of the setup I encourage you to check out antlr's maven [plugin](http://www.antlr.org/api/maven-plugin/latest/) and the installation steps for [ANTLR](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md).
