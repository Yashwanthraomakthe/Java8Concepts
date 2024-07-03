package predicates_Task02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ResponsePredicateTask06To10 {

	public static void main(String[] args) {
		// Create a list of responses
		List<Response> responseList = new ArrayList<>();
		responseList.add(new Response("Response 1", 200, "JSON"));
		responseList.add(new Response("Response 2", 400, "Type 2"));
		responseList.add(new Response("Response 3", 400, "JSON"));
		responseList.add(new Response("Response 4", 500, "Type 4"));
		responseList.add(new Response("Response 5", 200, "JSON"));

		// Define the predicate to check if the status code is 400
		Predicate<Response> statusCodePredicate = response -> response.getStatusCode() == 400;

		// Print all the responses with status code 400
		System.out.println("Print all the responses with status code 400");
		for (Response response : responseList) {
			if (statusCodePredicate.test(response)) {
				System.out.println("Response Body:- " + response.getResponseBody() + " : Status Code:- "
						+ response.getStatusCode() + ": Response Type:- " + response.getResponseType());

			}
		}

		// Define the predicate to check if the response type is JSON
		Predicate<Response> responseTypePredicate = response -> response.getResponseType().equalsIgnoreCase("JSON");
		// Print all the responses with response type JSON
		System.out.println();
		System.out.println("Print all the responses with response type JSON");
		for (Response response : responseList) {
			if (responseTypePredicate.test(response)) {
				System.out.println("Response Body:- " + response.getResponseBody() + " : Status Code:- "
						+ response.getStatusCode() + ": Response Type:- " + response.getResponseType());

			}
		}

		// Define the predicate to check if the status code is 400 and response type is
		// JSON
		Predicate<Response> statusCodeAndResponseTypePredicate = response -> response.getStatusCode() == 400
				&& response.getResponseType().equalsIgnoreCase("JSON");

		// Print all the responses with status code 400 and response type JSON
		System.out.println();
		System.out.println("Responses with status code 400 and response type JSON");
		for (Response response : responseList) {
			if (statusCodeAndResponseTypePredicate.test(response)) {
				System.out.println("Response Body:- " + response.getResponseBody() + " : Status Code:- "
						+ response.getStatusCode() + ": Response Type:- " + response.getResponseType());

			}
		}

		// Define the predicate to check if the status code is 400 and response type is
		// JSON
		Predicate<Response> statusCodeOrResponseTypePredicate = response -> response.getStatusCode() == 400
				|| response.getResponseType().equalsIgnoreCase("JSON");

		// Print all the responses with status code 400 or response type JSON
		System.out.println();
		System.out.println("Responses with status code 400 OR response type JSON");
		for (Response response : responseList) {
			if (statusCodeOrResponseTypePredicate.test(response)) {
				System.out.println("Response Body:- " + response.getResponseBody() + " : Status Code:- "
						+ response.getStatusCode() + ": Response Type:- " + response.getResponseType());

			}
		}

		// Define the predicate to check if the status code is not 400 and response type
		// is JSON
		Predicate<Response> statusCodeNotAndResponseTypePredicate = response -> response.getStatusCode() != 400
				&& response.getResponseType().equalsIgnoreCase("JSON");

		// Print all the responses with status code not 400 and response type JSON
		System.out.println();
		System.out.println("Responses with status code not 400 and response type JSON");
		for (Response response : responseList) {
			if (statusCodeNotAndResponseTypePredicate.test(response)) {
				System.out.println("Response Body:- " + response.getResponseBody() + " : Status Code:- "
						+ response.getStatusCode() + ": Response Type:- " + response.getResponseType());

			}
		}

	}

}
