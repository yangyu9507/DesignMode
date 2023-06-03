package com.yaron.state.lagou.example2;

import com.yaron.state.lagou.example2.impl.Acknowledged;
import lombok.Data;

import java.util.Optional;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
@Data
public class PackageContext {

    private PackageState currentState;
    private String packageId;

    public PackageContext(PackageState currentState, String packageId) {
        this.currentState = Optional.ofNullable(currentState).orElse(Acknowledged.getInstance());
        this.packageId = packageId;
    }

    public void update(){
        this.currentState.updateState(this);
    }

}
