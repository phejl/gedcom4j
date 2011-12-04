/*
 * Copyright (c) 2009-2011 Matthew R. Harrah
 * 
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */
package com.mattharrah.gedcom4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Main (root) class for an entire GEDCOM file.
 * 
 * @author frizbog1
 */
public class Gedcom {
	public Map<String, Family> families = new HashMap<String, Family>();
	public Header header;
	public Map<String, Individual> individuals = new HashMap<String, Individual>();
	public Map<String, Multimedia> multimedia = new HashMap<String, Multimedia>();
	public Map<String, Note> notes = new HashMap<String, Note>();
	public Map<String, Repository> repositories = new HashMap<String, Repository>();
	public Map<String, Source> sources = new HashMap<String, Source>();
	public Submission submission;
	public Map<String, Submitter> submitters = new HashMap<String, Submitter>();
	public Trailer trailer;
}
