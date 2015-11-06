package com.jillukowicz.spring.boot.flyway;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;


/**
 * @author jillukowicz
 */
@Controller
public class WebController
{

  @Autowired
  private Flyway flyway;


  @RequestMapping(value = "/migrate-from-custom-location", method = RequestMethod.POST)
  public
  @ResponseBody
  String migrate() throws SQLException
  {
    flyway.setLocations("custom_flyway_location");
    flyway.migrate();

    return JsonNodeFactory.instance.textNode("OK").textValue();

  }

}
