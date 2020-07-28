package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{



    List<OrganizationComponent> organizationComponentList = new ArrayList<>();
    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println("--------------------"+getName()+"-------------------------");
        organizationComponentList.forEach(x -> System.out.println(x));
    }
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }
}
