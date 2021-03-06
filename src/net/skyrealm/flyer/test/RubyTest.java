package net.skyrealm.flyer.test;

import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.script.ScriptContext;

import net.skyrealm.flyer.util.ScriptManager;

public class RubyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine jRuby = manager.getEngineByName("jruby");
		ScriptContext context = jRuby.getContext();
		try {
			jRuby.eval("puts 'hello world'");
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		*/
		ScriptManager.initialize();
		ScriptManager.evaluateScript("test.rb");
		ScriptManager.executeFunction("test.rb", "println", "hello!");
	}

}
