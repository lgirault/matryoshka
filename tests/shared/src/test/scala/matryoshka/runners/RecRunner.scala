/*
 * Copyright 2014–2018 SlamData Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package matryoshka.runners

import matryoshka._

import org.specs2.matcher._

abstract class RecRunner[F[_], A] {
  // NB: This is defined as a function to make the many definition sites
  //     slightly shorter.
  def run[T](implicit T: Recursive.Aux[T, F]): T => MatchResult[A]
}
