/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1998-2012 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * http://glassfish.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.sun.xml.dtdparser;

import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * do-nothing implementation of DTDEventHandler.
 */
public class DTDHandlerBase implements DTDEventListener {

    public void processingInstruction(String target, String data)
            throws SAXException {
    }

    public void setDocumentLocator(Locator loc) {
    }

    public void fatalError(SAXParseException e) throws SAXException {
        throw e;
    }

    public void error(SAXParseException e) throws SAXException {
        throw e;
    }

    public void warning(SAXParseException err) throws SAXException {
    }

    public void notationDecl(String name, String publicId, String systemId) throws SAXException {
    }

    public void unparsedEntityDecl(String name, String publicId,
                                   String systemId, String notationName) throws SAXException {
    }

    public void endDTD() throws SAXException {
    }

    public void externalGeneralEntityDecl(String n, String p, String s) throws SAXException {
    }

    public void internalGeneralEntityDecl(String n, String v) throws SAXException {
    }

    public void externalParameterEntityDecl(String n, String p, String s) throws SAXException {
    }

    public void internalParameterEntityDecl(String n, String v) throws SAXException {
    }

    public void startDTD(InputEntity in) throws SAXException {
    }

    public void comment(String n) throws SAXException {
    }

    public void characters(char ch[], int start, int length) throws SAXException {
    }

    public void ignorableWhitespace(char ch[], int start, int length) throws SAXException {
    }

    public void startCDATA() throws SAXException {
    }

    public void endCDATA() throws SAXException {
    }


    public void startContentModel(String elementName, short contentModelType) throws SAXException {
    }

    public void endContentModel(String elementName, short contentModelType) throws SAXException {
    }

    public void attributeDecl(String elementName, String attributeName, String attributeType,
                              String[] enumeration, short attributeUse, String defaultValue) throws SAXException {
    }

    public void childElement(String elementName, short occurence) throws SAXException {
    }

    public void mixedElement(String elementName) throws SAXException {
    }

    public void startModelGroup() throws SAXException {
    }

    public void endModelGroup(short occurence) throws SAXException {
    }

    public void connector(short connectorType) throws SAXException {
    }
}

