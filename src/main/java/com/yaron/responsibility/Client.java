package com.yaron.responsibility;

import com.yaron.responsibility.approver.impl.CollegeApprover;
import com.yaron.responsibility.approver.impl.DepartmentApprover;
import com.yaron.responsibility.approver.impl.SchoolMasterApprover;
import com.yaron.responsibility.approver.impl.ViceSchoolMasterApprover;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(1, 3000, 1);
        DepartmentApprover departmentApprover = new DepartmentApprover("系主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("校长");

        // 责任链形成  闭环
        departmentApprover.setNextApprover(collegeApprover);
        collegeApprover.setNextApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setNextApprover(schoolMasterApprover);
        schoolMasterApprover.setNextApprover(collegeApprover);


        departmentApprover.procesRequest(request);


    }
}
