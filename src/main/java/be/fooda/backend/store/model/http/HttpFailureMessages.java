package be.fooda.backend.store.model.http;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HttpFailureMessages {

    SOME_MESSAGE(""),
    STORE_ALREADY_EXIST("This store already exists."),
    USER_DOES_NOT_EXIST("user does not exist"),
    ADDRESS_DOES_NOT_EXIST("address does not exist"),
    CONTACT_DOES_NOT_EXIST("contact does not exist"),
    MISSING_PRODUCT_SET("products do not exist"),
    MISSING_MEDIA_SET("media do not exist"),
    UNKNOWN_FAILURE(""),
     NO_STORES_FOUND("no stores found"),
    STORE_DOES_NOT_EXIST("store does not exist") ,
    CAN_NOT_ADD_MENU_ITEM_AS_STORE_DOES_NOT_EXIST ("can't add MenuItem as store does not exist") ,
    MENU_ITEM_CAN_NOT_BE_DELETED("could not delete menu item"),
    MENU_ITEM_CAN_NOT_BE_EDITED("menu item can't be edited") ,
    STORE_COULD_NOT_BE_DELETED("could not delete the store") ,
    NO_MENU_ITEM_FOUND("could not find the product")  ;
    private final String description;
}
