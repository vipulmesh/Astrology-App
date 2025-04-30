import java.util.*;

public class MyClass {
  public static void main(String args[]) {
    // astrologyapp_SOULSCOPE
    int[] dob = new int[1];
    Scanner vp = new Scanner(System.in);
    System.out.println("Welcome To SoulScope: Your Astrological Partner");
    System.out.println("---------------------------------");
    System.out.println(" BY VIPUL MESHRAM");
    System.out.println("---------------------------------");
    System.out.println("Write Your DOB only Date (DD)");
    System.out.println("---------------------------------");
    int inputDob = vp.nextInt();
    if (inputDob >= 10) {
      int sum = (inputDob / 10) + (inputDob % 10);
      dob[0] = sum;
    } else {
      dob[0] = inputDob;
    }
    
    System.out.println("Your Mulank is: " + dob[0]);

    while (true) {
      System.out.println("----------------------------------------");
      System.out.println("Select Any Option From Below");
      System.out.println("1: Know Your Personality");
      System.out.println("2: Know Your Lucky Colours.");
      System.out.println("3: Best Careers For You !");
      System.out.println("0: Exit the App");
      int opt_menu = vp.nextInt();

      if (opt_menu == 0) {
        System.out.println("Thank you for using the app. Goodbye!");
        break;
      }

      if (opt_menu == 1) {
        switch (dob[0]) {
          case 1: System.out.println("This number indicates progress & arrogance. The person has to gain control over his arrogance to get success. In case the number is positive, this person will be capable of making friends from any base number category. However, in the case of a negative number, making friends for this person will be a huge challenge. Parents are advised to be calm with the child under this Moolank category."); 
          break;
          case 2: System.out.println("A person having this Moolank is likely to be emotional, introvert & inclined towards art. Also, such a person is advised to make friends with similar interests & nature. The adverse effect of this characteristic makes them weak in judgment owing to their excessive emotions. These people need to have trustworthy people in their surroundings to make a sound & balanced decision. These people have strong debating abilities."); 
          break;
          case 3: System.out.println("A person with this base number on the correct path will lead to being an ambitious, knowledgeable, strong-willed & positive individual. These people will always be determined to follow their desire. In case they meet with the right kind of opportunity, they have the ability to become Guru in their lifetime. On the other hand, if this person has a negative number than he would be excessively ambitious & egoistic."); 
          break;
          case 4: System.out.println("People from this category have in-depth knowledge of their subject of interest. These people are outstanding in their studies & also keep searching for ways to help the community. Owing to this characteristic they can be good professors, scientists & researchers. Under the guidance of a competent mentor, they can accomplish greater heights in life. Though these people are spiritual but always experience a dilemma between spirituality & materialism"); 
          break;
          case 5: System.out.println("These people are quite sharp in their thoughts. They have the capability to understand the hidden meaning of things & that too very quickly. A person from this base number would have many friends. Parents of the kids from this category should not be spoiled & need to be taught to share & care. These people are likely to be distant from their home & family in an emotional manner."); 
          break;
          case 6: System.out.println("Such people are mostly artistic, logical & full of emotions. They generally have a balanced nature, which helps them to accomplish success. In very scarce situations their emotions lead them to issues in life. These people need to be guided towards ethical living in childhood. These people can do well as artists & also in government jobs.");
           break;
          case 7: System.out.println("People who have number 7 as Moolank are likely to be very emotional & intelligent. However, getting success in its capacity is quite difficult. They need continuous support from Guru, Parents & Friends. In case, this number is negative then these people end up being lazy & fearful of taking the initiative."); 
          break;
          case 8: System.out.println("Moolank 8 is for very practical & hard-working people. Under the circumstances where this number is positive, a person will do his work with utmost honesty & will gain great success. On the other hand, if this is a negative number; this person will incline towards finding shortcuts to get success & face failures. The parents of such kids need to be balanced in approach & should have cordial & friendly terms with them."); 
          break;
          case 9: System.out.println("An individual having base number 9 will be very knowledgeable & energetic. These people are most willing to help others. Their involvement in any work they do is deeper. They attempt to become a perfectionist in any task they take up for a longer span of time. These people struggle to get much love from the opposite gender. Parents of such kids should help them to control anger & divert them towards prayers."); 
          break;
          default: System.out.println("error01:Contact Admin");
        }
      } else if (opt_menu == 2) {
        switch (dob[0]) {
          case 1: System.out.println("Number 1 is governed by the Sun and should use Red, Orange and Gold colour for luck."); 
          break;
          case 2: System.out.println("Number 2 is governed by the Moon and should use Orange, White, and Silver colour for luck.");
           break;
          case 3: System.out.println("Number 3 is governed by the Planet Jupiter and should use Yellow, Purple, and Pink colour for luck"); 
          break;
          case 4: System.out.println("Number 4 is governed by the Planet Rahu and should use Blue and Grey colour for luck."); 
          break;
          case 5: System.out.println("Number 5 is governed by the Planet Mercury and should use Green and Turquoise colour for luck."); 
          break;
          case 6: System.out.println("Number 6 is governed by the Planet Venus and should use White, Light Blue, and Green colour for luck"); 
          break;
          case 7: System.out.println("Number 7 is governed by the Planet Ketu and should use Light yellow, White, and Green colour for luck.");
           break;
          case 8: System.out.println("Number 8 is governed by the Planet Saturn and should use the colour Dark Blue or Black colour for luck."); 
          break;
          case 9: System.out.println("Number 9 is governed by the Planet Mars and should use Red, Maroon, and Rose colour for luck"); 
          break;
          default: System.out.println("error02 Contact Admin");
        }
      } else if (opt_menu == 3) {
        switch (dob[0]) {
          case 1: System.out.println("Leadership roles, entrepreneurship, individual contributor roles, political career, sports or the arts. They can also make their career in the power sector, nuclear power, hospitals, medicines, pharma, chemical and gold.");
           break;
          case 2: System.out.println("A career that involves collaboration and teamwork, customer service, diplomates, counselling, social work, health care, stock market, banking, soft drinks, milk and milk products, liquor shop, import-export, and textile sector is the best option for number 2 people"); 
          break;
          case 3: System.out.println("A career in entertainment, media, public speaking, teaching, writing, advertising or anything that involves creativity and self-expression. Since number 3 is ruled by the planet Mars, they can also make their career in automobiles, real estate, arms and ammunition, and medical surgeons."); 
          break;
          case 4: System.out.println("A suitable career for number 4 people is in finance, accounting, law, engineering, science or any profession requiring precision and attention to detail. Number 4 is ruled by the planet Mercury therefore careers in FMCG, telecommunication, IT, travel and tourism, print media, and astrology are also good options.");
           break;
          case 5: System.out.println("A career that involves travel, sales, marketing, public relation, or anything that allows for freedom and adventure. Number 5 people can also have good options in financial institutions, banking, NBFCs, educational institutes, law, investment banking, and consulting companies or they can have their own consultancy firm or work in religious organisations."); 
          break;
          case 6: System.out.println("The best suitable career option for number 6 people are hospitality, healthcare, education, counselling, or any profession that involves helping others. Other than these, since number 6 is ruled by the planet Venus, diamond, diamond jewellery, fashion, film industry, cosmetic, luxury brands, perfumeries, and interior decoration are the best options in career for number 6 people."); 
          break;
          case 7: System.out.println("Most suitable career for number 7 people is in research, analysis, science, technology or any profession that involves solitude and introspection. Being number 7 ruled by Ketu, they have good career options in electronic infrastructure, liaison work, waste recycling and detective work."); 
          break;
          case 8: System.out.println("Career in business, management, finance, law or anything that involves power or authority is a suitable career option for number 8 people. These people can also make their career in iron ore, leather, coal, scrap trading, and law firms or they can also become judges."); 
          break;
          case 9: System.out.println("Career in humanitarianism, philanthropy, education, healthcare or any profession that involves making a positive impact on society is the most suitable optionfor number 9 people. Other than these, they can optfor a job in space technology, radar system, and wireless technology."); 
          break;
          default: System.out.println("error03 Contact Admin");
        }
      } else {
        System.out.println("Invalid option. Please select a valid choice.");
      }
    }

    vp.close();
  }
}