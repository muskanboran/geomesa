/***********************************************************************
 * Copyright (c) 2013-2018 Commonwealth Computer Research, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0
 * which accompanies this distribution and is available at
 * http://www.opensource.org/licenses/apache2.0.php.
 ***********************************************************************/

package org.apache.spark.sql

import org.locationtech.geomesa.spark.jts._

object SQLTypes {

  def init(sqlContext: SQLContext): Unit = {
    initJTS(sqlContext)
    SQLGeometricConstructorFunctions.registerFunctions(sqlContext)
    SQLGeometryProcessingFunctions.registerFunctions(sqlContext)
    SQLGeometricOutputFunctions.registerFunctions(sqlContext)
    SQLRules.registerOptimizations(sqlContext)
  }
}
