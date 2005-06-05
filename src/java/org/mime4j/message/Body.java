/*
 *  Copyright 2004 the mime4j project
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mime4j.message;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Encapsulates the body of an entity (see RFC 2045).
 *
 * @author Niklas Therning
 * @version $Id: Body.java,v 1.4 2004/10/04 15:36:43 ntherning Exp $
 */
public interface Body {

    /**
     * Gets the parent of this body.
     * 
     * @return the parent.
     */
    Entity getParent();
    
    /**
     * Sets the parent of this body.
     * 
     * @param parent the parent.
     */
    void setParent(Entity parent);
    
    /**
     * Writes this body to the given stream in MIME message format.
     * 
     * @param out the stream to write to.
     * @throws IOException on I/O errors.
     */
    void writeTo(OutputStream out) throws IOException;
}