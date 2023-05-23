package com.javatpoint.router.model;

import com.javatpoint.router.exception.IncorrectPathException;

/**
 * Problem Description:
 *
 * We want to implement a middleware router for our web service, which based on the path returns different strings (these would represent “functions to invoke” in a real application).
 *
 * Our interface for the router looks something like:
 *
 *
 * interface Router {
 *
 *   fun withRoute(path: String, result: String) : Unit; //void
 *
 *   fun route(path: String) : String;
 *
 * }
 *
 * Usage:
 * Router.withRoute("/bar", "result") // adding a new route
 * Router.route("/bar") -> "result"
 */
public interface IRouter {
    void withRoute(String path, String result);
    String route(String path) throws IncorrectPathException;
}
