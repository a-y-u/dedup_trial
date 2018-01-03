package org.apache.apex.examples.dedup;

import java.util.Date;

import java.util.Random;

import org.apache.apex.malhar.lib.dedup.TimeBasedDedupOperator;
import org.apache.apex.malhar.lib.io.ConsoleOutputOperator;
import org.apache.hadoop.conf.Configuration;

import com.datatorrent.api.Context;
import com.datatorrent.api.DAG;
import com.datatorrent.api.DefaultOutputPort;
import com.datatorrent.api.InputOperator;
import com.datatorrent.api.StreamingApplication;
import com.datatorrent.api.annotation.ApplicationAnnotation;
import com.datatorrent.common.util.BaseOperator;

@ApplicationAnnotation(name = "DedupExample")

public class Application implements StreamingApplication
{

  @Override
  public void populateDAG(DAG dag, Configuration conf)
  {
    // Test Data Generator Operator
    RandomDataGeneratorOperator gen = dag.addOperator("RandomGenerator", new RandomDataGeneratorOperator());

    
  }
  
}
