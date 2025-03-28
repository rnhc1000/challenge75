package br.dev.ferreiras.challenges.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/*
In the world of Dota2, there are two parties: the Radiant and the Dire.
The Dota2 senate consists of senators coming from two parties.
Now the Senate wants to decide on a change in the Dota2 game.
The voting for this change is a round-based procedure.
In each round, each senator can exercise one of the two rights:
Ban one senator's right:
A senator can make another senator lose all his rights in this and all
the following rounds.
Announce the victory:
If this senator found the senators who still have rights to vote are all
from the same party, he can announce the victory and decide on the change in the game.
Given a string senate representing each senator's party belonging.
The character 'R' and 'D' represent the Radiant party and the Dire party.
Then if there are n senators, the size of the given string will be n.
The round-based procedure starts from the first senator to the last senator in the given order.
This procedure will last until the end of voting.
All the senators who have lost their rights will be skipped during the procedure.
Suppose every senator is smart enough and will play the best strategy for his own party.
Predict which party will finally announce the victory and change the Dota2 game.
The output should be "Radiant" or "Dire".
Example 1:

Input: senate = "RD"
Output: "Radiant"
Explanation:
The first senator comes from Radiant and he can just ban the next senator's right in round 1.
And the second senator can't exercise any rights anymore since his right has been banned.
And in round 2, the first senator can just announce the victory since he is the only guy in
the senate who can vote.
Example 2:
Input: senate = "RDD"
Output: "Dire"
Explanation:
The first senator comes from Radiant and he can just ban the next senator's right in round 1.
And the second senator can't exercise any rights anymore since his right has been banned.
And the third senator comes from Dire and he can ban the first senator's right in round 1.
And in round 2, the third senator can just announce the victory since he is the only guy in
the senate who can vote.

Idea by https://leetcode.com/L30XL1U/
We will use a two queue approach.
Recall, each senator has a position to exercise their right.
The ones to the left have an earlier turn than the ones to the right.
rad is queue that holds all positions of active senators in "Radiant"
dir is queue that holds all positions of active senators in "Dire".
Active being that they still have the right to vote.
Our queue will be ordered so that the senators with earlier voting power
come first (to the left of the queue).
To goal is to have the earliest senator of each queue fight each other to see
who gets to eliminate the other depending on their position.
Obviously, the one with the earlier position will win.
The loser is removed from the queue since they are no longer active.
The winner will go to the end of the queue for the next round.
We keep doing this until one queue is empty which means there are no
more senators on the team.
 */
@ClassPreamble(
        author = "Ricardo Ferreira",
        date = "10/01/2024",
        currentRevision = 7,
        lastModified = "10/01/2024",
        lastModifiedBy = "Ricardo Ferreira",
        reviewers = {}
)

public class Dota2Senate {
  public static void main(String[] args) {
    String senate = "RDD";
    String response = Dota2Senate.predictPartyVictory(senate);
    System.out.println(response);
  }

  public static String predictPartyVictory(String senate) {
    Queue<Integer> radiant = new LinkedList<>(), dire = new LinkedList<>();
    int size = senate.length();
    // Add all senators to respect queue with index
    for (int i = 0; i < size; i++) {
      if (senate.charAt(i) == 'D') {
        dire.add(i);
      } else {
        radiant.add(i);
      }
    }
    // Use increasing n to keep track of position
    while (!radiant.isEmpty() && !dire.isEmpty()) {
      // Only "winner" stays in their queue
      if (radiant.peek() < dire.peek()) {
        radiant.add(size++);
      } else {
        dire.add(size++);
      }
      radiant.poll();
      dire.poll();
    }
    return (radiant.isEmpty()) ? ("Dire") : ("Radiant");
  }
}

