package Algorithms;
// Exercise:
// Complete the given Bidding class that will be used for a bidding system.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

// This interface has all the agent methods you'll need to do this exercise.
// You should not implement the interface.
interface IAgent {
    // This will return the amount by which the agent wants to increase its bid by
    // (i.e. how much they want to add onto their bid as it stands so far):
    // You should only call this method once per bid. Calling it more than once for a bid
    // may result in errors.
    public int getBidIncrease();

    // a unique id you can use to identify this agent, if necessary:
    public int id();
}

class Bidding {
    private final ArrayList<IAgent> agents;
    private final HashMap<IAgent, Integer> agent_bids = new HashMap<>();
    private final HashMap<IAgent, Integer> currentTopBids = new HashMap<>();

    private boolean stopBiddingProcess = false;


    public Bidding(ArrayList<IAgent> agents) {
        this.agents = agents;
        // TODO: any other initialisation you need


    }

    // Returns the agents that are left at the end of the bidding process
    public ArrayList<IAgent> run() {
        // TODO: implement this method according to the rules below

        /*

        ------------------------
        SCOPING OF THE SOLUTION
        ------------------------
        1. Recursion on all agents in the arrayList
        2. Have a way of iterating over agents and getting the bid Increases
        3. If the bid is less or equal to the previous bid then we withhold from the bidding process
        4. If the bid is greater or equal to the previous bid then we proceed to bid
        5. The bidding process will continue until the agents stop upping their bids
        6. We shall now return the agents with the highest bids

        -----------------------------
        IMPLEMENTATION NOTES
        -----------------------------
        1. Have a way of keeping track of the agents' current highest bid
        2. Have a way of keeping track of the highest bid in the bid cycle of
        3. Have a way of keeping track of the current bid cycle
        4. Have a way of determining how to end bidding {in case the increaseBid of all agents is equal to the current max bid}]
        5. Bidding process will stop when no agent ups their bid

        **/

        int currentBid;
        int max_Bid_val = Integer.MIN_VALUE;


        while (!stopBiddingProcess) {


            for (IAgent agent : agents) {
                currentBid = agent.getBidIncrease();

                //-----------> Register New Agent Bid -----
                registerNewAgentBid(agent, currentBid);

                Optional<Integer> currentTotalBid = getAgentCurrentTotalBidAmount(agent);
                if (currentTotalBid.isPresent()) {
                    if (isCurrentBidIsHigherOrEqualToAnyOtherBid(currentTotalBid.get())) {
                        //----> add agent to top ranking bids list
                        max_Bid_val = currentTotalBid.get();
                        currentTopBids.put(agent, currentTotalBid.get());
                    }
                }


          //      stopBiddingProcess = changeStatusOfBidProcess(hasAgentUppedBidAmount(agent, agent.getBidIncrease()));
                //stopBiddingProcess ? break : continue;

            }

        }

        Optional<ArrayList<IAgent>> result = highestBidAgents();

        // TODO: this line should be removed
        return result.orElseGet(result::get);

    }

    //  TODO(optional): add any other methods(with implementation) you find useful


    //--------> Return the highest bid agent_bids
    public Optional<ArrayList<IAgent>> highestBidAgents() {
        int max_BidAmount = max_BidAmount();
        ArrayList<IAgent> result = new ArrayList<>();

        currentTopBids.forEach((key, value) -> {
            if (value >= max_BidAmount) {
                result.add(key);
            }
        });

        return Optional.of(result);
    }


    //--------> Change Status of Agent has upped their bid amount
    public boolean changeStatusOfBidProcess(IAgent agent,int max_Bid_val) {

        //---> check if the currentTotalBid of the agent is greater of equal to the max_BidAmount
        //-
        Optional<Integer> currentAgentBid = getAgentCurrentTotalBidAmount(agent);
        if (currentAgentBid.isPresent()){
            if (currentAgentBid.get() > max_Bid_val){
                return true;
            }
        }

        return false;

    }


    //--------> Check if Agent has upped their bid amount
    public boolean hasAgentUppedBidAmount(IAgent agent, Integer bid) {
        if (!agent_bids.containsKey(agent)) {
            //----> first bid round is
            return true;
        }
        //---> Agent has upped their bid amount
        return agent_bids.get(agent) + bid > agent_bids.get(agent);

    }


    //---------> Get Agent Current Bid Total Amount ------

    public Optional<Integer> getAgentCurrentTotalBidAmount(IAgent agent) {
        return Optional.ofNullable(agent_bids.get(agent));
    }


    //----> check if bid is higher than the previous bid
    public Boolean isCurrentBidIsHigherOrEqualToAnyOtherBid(Integer bid) {
        return bid >= max_BidAmount();
    }


    //------------> Get the highest bid so far -----
    public int max_BidAmount() {
        final int[] max_val = {Integer.MIN_VALUE};
        currentTopBids.forEach((key, value) -> {
            if (value > max_val[0]) {
                max_val[0] = value;
            }
        });
        return max_val[0];
    }


    public void registerNewAgentBid(IAgent agent, Integer bid) {

        //---> validate if the value is greater or equal to the current max_BidAmount
       ///  if fail return



        if (!agent_bids.containsKey(agent)) {
            agent_bids.put(agent, bid);
        } else {
            //----> increasing the bid
            agent_bids.put(agent, agent_bids.get(agent) + bid);
        }
//////
    }
}

//   Implement the sections of code marked TODO above.

//   Rules for bidding:
//   Agents always bid in sequence, e.g. agent 1 bids first, then agent 2, etc.
//   The bidding starts with the first agent deciding on their initial bid (which will be returned by `getBidIncrease`). The amount can also be 0.
//   The next agent (e.g. agent 2) must then increase their bid so that their total bid is as much as any other agent's total bid (which so far is only agent 1), or be forced to withdraw from the bidding completely. (if the agent has withdrawn, they will be skipped from here onwards). They may also decide to bid more, in which case the next agent has to match that higher total bid (or withdraw).
//   The bidding will come around to agent 1 again if their current total bid does not match the highest total bid. The agent must increase their total bid (by returning the value they want to increase it by from `getBidIncrease`) so that their total bid will match the highest total bid that any other agent has put in so far, or withdraw from the bidding. They can also have the option to decide to bid more, same as discussed above.
//   Keep in mind that the bidding can circle the group of agents more than once, depending on if agents up their bids. Each agent who wishes to proceed is required to have committed a total bid that is equal to the highest total bid made by any other agent, counted over the duration of the bidding process. NB: The bidding will end immediately once this condition is met.
//   There can be multiple agents left at the end of bidding process, all with the same bid. That will be handled by a second bidding process that's outside the scope of this exercise.

//   Hints:
// - Be sure you understand the above bidding rules clearly.
// - Do not implement a literal solution to the problem, i.e. don't read each line on its own and write code just for that part of the requirements. Rather, think about it holistically so you can come up with a solution that meets all the requirements.
// - No consideration should be paid to performance - clear, readable code is more imporant in this exercise.
