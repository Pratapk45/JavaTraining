package com.javaproject.onlinevotingsystem;
import java.util.*;

public class VotingService {

	    private HashMap<String, User> users = new HashMap<>();
	    private HashMap<String, Boolean> voted = new HashMap<>();
	    private HashMap<String, Integer> votes = new HashMap<>();
	    private ArrayList<Candidate> candidates = new ArrayList<>();

	    private Scanner sc = new Scanner(System.in);
	    private String loggedInUser = null;

	    public VotingService() {

	        candidates.add(new Candidate(1, "Rahul"));
	        candidates.add(new Candidate(2, "Amit"));
	        candidates.add(new Candidate(3, "Neha"));

	        votes.put("Rahul", 0);
	        votes.put("Amit", 0);
	        votes.put("Neha", 0);
	    }

	    // Register User
	    public void register() {

	        System.out.print("Enter Username : ");
	        String username = sc.next();

	        if (users.containsKey(username)) {
	            System.out.println("User already exists.");
	            return;
	        }

	        System.out.print("Enter Password : ");
	        String password = sc.next();

	        users.put(username, new User(username, password));
	        voted.put(username, false);

	        System.out.println("Registration Successful.");
	    }

	    // Login
	    public void login() {

	        System.out.print("Enter Username : ");
	        String username = sc.next();

	        System.out.print("Enter Password : ");
	        String password = sc.next();

	        if (users.containsKey(username)
	                && users.get(username).getPassword().equals(password)) {

	            loggedInUser = username;
	            System.out.println("Login Successful.");

	        } else {

	            System.out.println("Invalid Username or Password.");
	        }
	    }

	    // View Candidates
	    public void viewCandidates() {

	        System.out.println("\nCandidate List");

	        for (Candidate c : candidates) {

	            System.out.println(c.getCandidateId()
	                    + " : "
	                    + c.getCandidateName());
	        }
	    }

	    // Vote
	    public void castVote() {

	        if (loggedInUser == null) {
	            System.out.println("Please login first.");
	            return;
	        }

	        if (voted.get(loggedInUser)) {
	            System.out.println("You have already voted.");
	            return;
	        }

	        viewCandidates();

	        System.out.print("Enter Candidate ID : ");
	        int id = sc.nextInt();

	        for (Candidate c : candidates) {

	            if (c.getCandidateId() == id) {

	                String name = c.getCandidateName();

	                votes.put(name, votes.get(name) + 1);

	                voted.put(loggedInUser, true);

	                System.out.println("Vote Cast Successfully.");

	                return;
	            }
	        }

	        System.out.println("Invalid Candidate ID.");
	    }

	    // Display Result
	    public void displayResult() {

	        System.out.println("\nElection Result");

	        int max = 0;
	        String winner = "";

	        for (String candidate : votes.keySet()) {

	            int count = votes.get(candidate);

	            System.out.println(candidate + " : " + count + " Votes");

	            if (count > max) {
	                max = count;
	                winner = candidate;
	            }
	        }

	        System.out.println("----------------------");
	        System.out.println("Winner : " + winner);
	        System.out.println("Total Votes : " + max);
	    }
}
