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
public class RandomDataGeneratorOperator extends BaseOperator implements InputOperator
  {

    public final transient DefaultOutputPort<TestEvent> output = new DefaultOutputPort<>();
    private final transient Random r = new Random();
    private int tuplesPerWindow = 100;
    private transient int count = 0;

    @Override
    public void beginWindow(long windowId)
    {
      count = 0;
    }

    @Override
    public void emitTuples()
    {
      if (count++ > tuplesPerWindow) {
        return;
      }
      TestEvent event = new TestEvent();
      event.id = r.nextInt(100);
      event.eventTime = new Date(System.currentTimeMillis() - (r.nextInt(60 * 1000)));
      //output.emit(event);
    }
  }

  
