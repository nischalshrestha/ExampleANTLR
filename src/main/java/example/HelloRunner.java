package example;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import example.HelloLexer;
import example.HelloParser;
import example.HelloParser.RContext;

public class HelloRunner {
	
	public static void main(String[] args) {
		CodePointCharStream inputStream = CharStreams.fromString("hello world");
		HelloLexer lexer = new HelloLexer(inputStream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		HelloParser parser = new HelloParser(tokenStream);
		RContext tree = parser.r();
		// leave some space before output..
		// there is an annoying message that shows up about antlr 4.4 
		// https://github.com/antlr/antlr4/issues/1782
		// code works fine though 
		System.out.println();
		System.out.println();
		System.out.println(tree.toStringTree());
	}
	 	 
}
