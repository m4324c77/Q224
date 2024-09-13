package io.compiler.main;

import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStreams;

import io.compiler.core.QGrammarLexer;
import io.compiler.core.QGrammarParser;
import io.compiler.core.ast.Program;

public class MainClass {
	public static void main(String[] args) {
		try {
			QGrammarLexer lexer;
			QGrammarParser parser;
			
			
			lexer = new QGrammarLexer(CharStreams.fromFileName("testaWhile.in"));
			
			
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			
			parser = new QGrammarParser(tokenStream);
			
			
			
			System.out.println("Compilador iniciado.");
			parser.programa();
			System.out.println("Programa compilado.");
			parser.exibirVar();
			
			//gerador
			Program program = parser.getProgram();
			
			//System.out.println(program.generateTarget());

			try {
				File f = new File(program.getName()+".java");
				FileWriter fr = new FileWriter(f);
				PrintWriter pr = new PrintWriter(fr);
				pr.println(program.generateTarget());
				pr.close();
			}
			
			catch (IOException ex){
				ex.printStackTrace();
			}
			
			
			
		}
		catch(Exception ex) {
			System.err.println("Erro! "+ex.getMessage());
			//ex.printStackTrace();
		}
	}
}
