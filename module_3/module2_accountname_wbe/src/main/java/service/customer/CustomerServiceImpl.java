package service.customer;

import model.customer.Customer;
import repository.customer.CustomerRepositoryImpl;
import repository.customer.ICustomerRepository;
import validate.Regex;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }

    @Override
    public void save(Customer customer) {
        this.customerRepository.save(customer);
    }


    @Override
    public void delete(Integer id) {
        this.customerRepository.delete(id);
    }

    @Override
    public void edit(Customer customer) {
        this.customerRepository.edit(customer);
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> searchByName(String nameSearch) {
        return customerRepository.searchByName(nameSearch);
    }


    public Map<String, String> validateCreate(Customer customer) {
        Map<String, String> errorMap = new HashMap<>();

        if (customer.getIdCard().equals("") || customer.getIdCard() == null) {
            errorMap.put("idCard", "ko được để trống");
        } else if (!Regex.isMatchesIdCard(customer.getIdCard())) {
            errorMap.put("idCard", "nhập idCard ko đúng định dạng. idCard phải là 9 số hoặc 10 số");
        }

        if (customer.getPhone().equals("") || customer.getPhone() == null) {
            errorMap.put("phone", "ko được để trống");
        } else if (!Regex.isMatchesPhone(customer.getPhone())) {
            errorMap.put("phone", "nhập sdt ko đúng định dạng. Phải là 090xxxxxxx hoặc 091xxxxxxx hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx");
        }

        if (customer.getEmail().equals("") || customer.getEmail() == null) {
            errorMap.put("email", "ko được để trống");
        } else if (!Regex.isMatchesEmail(customer.getEmail())) {
            errorMap.put("email", "nhập email ko đúng định dạng. vd: nhuhoa2303gmail.com");
        }
        if (customer.getName().equals("")) {
            errorMap.put("name", "ko được bỏ trống");
        }
        if (customer.getAddress().equals("")) {
            errorMap.put("địa chỉ", "ko được bỏ trống");
        }

        if (customer.getBirthday().equals("") || customer.getBirthday() == null) {
            errorMap.put("birthday", " ko được bỏ trống");
        } else if (!Regex.isMatchesBirthday(customer.getBirthday())) {
            errorMap.put("birthday", "ngày lớn hơn ngày hiện tại");
        }

        if (errorMap.isEmpty()) {
            customerRepository.save(customer);
        }
        return errorMap;
    }




    public Map<String, String> validateEdit(Customer customer) {
        Map<String, String> errorMap = new HashMap<>();

        if (customer.getIdCard().equals("") || customer.getIdCard() == null) {
            errorMap.put("idCard", "ko được để trống");
        } else if (!Regex.isMatchesIdCard(customer.getIdCard())) {
            errorMap.put("idCard", "nhập idCard ko đúng định dạng. idCard phải là 9 số hoặc 10 số");
        }

        if (customer.getPhone().equals("") || customer.getPhone() == null) {
            errorMap.put("phone", "ko được để trống");
        } else if (!Regex.isMatchesPhone(customer.getPhone())) {
            errorMap.put("phone", "nhập sdt ko đúng định dạng. Phải là 090xxxxxxx hoặc 091xxxxxxx hoặc (84)+90xxxxxxx hoặc (84)+91xxxxxxx");
        }

        if (customer.getEmail().equals("") || customer.getEmail() == null) {
            errorMap.put("email", "ko được để trống");
        } else if (!Regex.isMatchesEmail(customer.getEmail())) {
            errorMap.put("email", "nhập email ko đúng định dạng. vd: nhuhoa2303gmail.com");
        }
        if (customer.getName().equals("")) {
            errorMap.put("name", "ko được bỏ trống");
        }
        if (customer.getAddress().equals("")) {
            errorMap.put("address", "ko được bỏ trống");
        }

        if (customer.getBirthday().equals("") || customer.getBirthday() == null) {
            errorMap.put("birthday", "ko được bỏ trống");
        }

        if (errorMap.isEmpty()) {
            customerRepository.edit(customer);
        }
        return errorMap;
    }





}
