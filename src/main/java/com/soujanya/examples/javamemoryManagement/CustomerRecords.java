package com.soujanya.examples.javamemoryManagement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer>{

  private Map<String, Customer> records;
  public CustomerRecords() {
    records = new HashMap<>();
  }

  public Map<String, CustomerReadOnly> getRecords() {
  // if we return this.records;
    // this will allow to change the records from outside the class and changes the original list.
    // Using records.clear();
    //which is not providing the encapsulation for the list.

    return Collections.unmodifiableMap(this.records);
    // this will not allow any modification to the original list
  }

  public void addCustomer(Customer customer) {
    this.records.put(customer.getName(), customer);
  }

  public CustomerReadOnly getCustomer(String name){
    return this.records.get(name);
  }

  @Override
  public Iterator<Customer> iterator() {
    return this.records.values().iterator();
  }
}
