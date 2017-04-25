/*
 * EL4J, the Extension Library for the J2EE, adds incremental enhancements to
 * the spring framework, http://el4j.sf.net
 * Copyright (C) 2006 by ELCA Informatique SA, Av. de la Harpe 22-24,
 * 1000 Lausanne, Switzerland, http://www.elca.ch
 *
 * EL4J is published under the GNU Lesser General Public License (LGPL)
 * Version 2.1. See http://www.gnu.org/licenses/
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * For alternative licensing, please contact info@elca.ch
 */
package ch.elca.el4j.services.xmlmerge;

/**
 * Base class for all exceptions thrown by XmlMerge.
 *
 * @svnLink $Revision$;$Date$;$Author$;$URL$
 *
 * @author Laurent Bovet (LBO)
 * @author Alex Mathey (AMA)
 */
public abstract class AbstractXmlMergeException extends RuntimeException {

	/**
	 * Default constructor.
	 */
	public AbstractXmlMergeException() {
		super();
	}

	/**
	 * Constructor with message.
	 *
	 * @param message Exception message
	 */
	public AbstractXmlMergeException(String message) {
		super(message);
	}

	/**
	 * Constructor with message and cause.
	 *
	 * @param message Exception message
	 * @param cause Exception cause
	 */
	public AbstractXmlMergeException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor with cause.
	 *
	 * @param cause Exception cause
	 */
	public AbstractXmlMergeException(Throwable cause) {
		super(cause);
	}

}
