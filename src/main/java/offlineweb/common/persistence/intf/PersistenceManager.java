/*
 * The MIT License
 *
 * Copyright 2017 papa.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package offlineweb.common.persistence.intf;

import java.util.List;

/**
 * Public API for persistence layer
 *
 * @author papa
 * Created on 7/4/17.
 */

public interface PersistenceManager {

    <T> List<T> findAll(Class<T> clazz) throws PersistenceException;

    <T, M> T findById(Class<T> clazz, M id) throws PersistenceException;

    <T> void saveOrUpdate(T entity) throws PersistenceException;

    <T> void saveOrUpdate(List<T> entities) throws PersistenceException;

    <T, M> List<T> execute(Class<T> clazz, QueryIntf<M> query) throws PersistenceException;

    <M> void execute(QueryIntf<M> query) throws PersistenceException;

}