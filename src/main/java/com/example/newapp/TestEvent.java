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
public class TestEvent
  {
    public int id;
    public Date eventTime;

    public TestEvent()
    {
    }

    public int getId()
    {
      return id;
    }

    public void setId(int id)
    {
      this.id = id;
    }

    public Date getEventTime()
    {
      return eventTime;
    }

    public void setEventTime(Date eventTime)
    {
      this.eventTime = eventTime;
    }

    @Override
    public String toString()
    {
      return "TestEvent [id=" + id + ", eventTime=" + eventTime + "]";
    }

  }
