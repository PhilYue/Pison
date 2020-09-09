package com.pi.pison.core;

/**
 * <p>todo</p>
 *
 * @author phil
 * @description todo
 * @createAt 2020-09-09 10:59
 * @since 1.0
 */
public interface JsonWhims<T> {

    void deepMerge(T source, T targat);
}
