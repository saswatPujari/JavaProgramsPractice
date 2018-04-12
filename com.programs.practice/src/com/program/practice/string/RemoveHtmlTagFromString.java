package com.program.practice.string;

/**
 * In case if a string contains html tags, then below example helps to trim the html tags from the string. 
 * The example uses regular expression to trim the html tags from the string.
 * @author Saswat
 *
 */
public class RemoveHtmlTagFromString {
	public static void main(String[] args) {
		        String text = "<B>I don't want this to be bold<\\B>";
		        System.out.println(text);
		        text = text.replaceAll("\\<.*?\\>", "");
		        System.out.println(text);
		}
}
