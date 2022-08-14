package com.github.ybqdren.lc;

import java.util.Random;

/**
 * @author zhao wen
 * @since 2022-07-26
 **/
public class lc1206 {

    class Skiplist {
        int level = 10;

        class Node {
            public int val;
            public Node[] ne = new Node[level];

            public Node(int _val) {
                this.val = _val;
            }
        }


        Random random = new Random();
        Node he = new Node(-1);

        public void find(int t, Node[] ns) {
            Node cur = he;
            for (int i = level - 1; i >= 0; i--) {
                while (cur.ne[i] != null && cur.ne[i].val < t) {
                    cur = cur.ne[i];
                }
                ns[i] = cur;
            }
        }

        public boolean search(int t) {
            Node[] ns = new Node[level];
            find(t, ns);
            return ns[0].ne[0] != null && ns[0].ne[0].val == t;
        }

        public void add(int num) {
            Node[] ns = new Node[level];
            find(num, ns);
            Node node = new Node(num);
            for (int i = 0; i < level; i++) {
                node.ne[i] = ns[i].ne[i];
                ns[i].ne[i] = node;
                if (random.nextInt(2) == 0) {
                    break;
                }
            }
        }

        public boolean erase(int num) {
            Node[] ns = new Node[level];
            find(num, ns);
            Node node = ns[0].ne[0];
            if (node == null || node.val != num) {
                return false;
            }

            for (int i = 0; i < level && ns[i].ne[i] == node; i++) {
                ns[i].ne[i] = ns[i].ne[i].ne[i];
            }

            return true;
        }
    }


/**
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */
}
