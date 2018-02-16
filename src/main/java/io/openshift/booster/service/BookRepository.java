/*
 * Copyright 2016-2017 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.openshift.booster.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import me.snowdrop.data.core.repository.SnowdropCrudRepository;
import org.springframework.data.domain.Pageable;

public interface BookRepository extends SnowdropCrudRepository<Book, Integer> {
    List<Book> findByAuthorLike(String author);

    Stream<Book> findByTitleLike(String title);

    List<Book> findByReleaseDate(LocalDate date, Pageable pageable);

    List<Book> findByAuthor(String author, Pageable pageable);

    List<Book> findByContentContains(String content, Pageable pageable);
}
