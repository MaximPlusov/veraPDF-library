/**
 * This file is part of veraPDF Library core, a module of the veraPDF project.
 * Copyright (c) 2015, veraPDF Consortium <info@verapdf.org>
 * All rights reserved.
 *
 * veraPDF Library core is free software: you can redistribute it and/or modify
 * it under the terms of either:
 *
 * The GNU General public license GPLv3+.
 * You should have received a copy of the GNU General Public License
 * along with veraPDF Library core as the LICENSE.GPL file in the root of the source
 * tree.  If not, see http://www.gnu.org/licenses/ or
 * https://www.gnu.org/licenses/gpl-3.0.en.html.
 *
 * The Mozilla Public License MPLv2+.
 * You should have received a copy of the Mozilla Public License along with
 * veraPDF Library core as the LICENSE.MPL file in the root of the source tree.
 * If a copy of the MPL was not distributed with this file, you can obtain one at
 * http://mozilla.org/MPL/2.0/.
 */
/**
 * 
 */
package org.verapdf.core;

import java.util.Collection;
import java.util.Set;

/**
 * A read only Directory that supports key and value types.
 * 
 * @author <a href="mailto:carl@openpreservation.org">Carl Wilson</a>
 * @param <K>
 *            the Directory key type
 * @param <V>
 *            the Directory value type
 *
 */
public interface Directory<K, V> {
    /**
     * @param key
     *            the key used to lookup a particular item
     * @return the value instance associated with the key
     */
    V getItem(final K key);

    /**
     * @return the Collection of values contained in the directory
     */
    Collection<V> getItems();

    /**
     * @return the Set of keys contained in the directory
     */
    Set<K> getKeys();

    /**
     * @return the number of items held in the directory
     */
    int size();

    /**
     * @return true if the directory contains no items, false if not.
     */
    boolean isEmpty();
}
