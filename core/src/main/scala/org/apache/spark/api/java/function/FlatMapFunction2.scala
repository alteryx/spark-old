/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.api.java.function

/**
 * A function that takes two inputs and returns zero or more output records.
 */
abstract class FlatMapFunction2[A, B, C] extends Function2[A, B, java.lang.Iterable[C]] {
  @throws(classOf[Exception])
  def call(a: A, b:B) : java.lang.Iterable[C]

  def elementType() : ClassManifest[C] = ClassManifest.Any.asInstanceOf[ClassManifest[C]]
}
