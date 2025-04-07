package org.kotlin.test2.mappers;

import org.kotlin.test2.ViewData;

public interface ItemMapper2<T> {
    ViewData map(T item);
}
